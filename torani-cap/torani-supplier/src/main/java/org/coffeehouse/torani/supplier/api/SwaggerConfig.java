package org.coffeehouse.torani.supplier.api;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.paths.SwaggerPathProvider;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by limingxing on 1/10/15.
 */
@EnableSwagger
public class SwaggerConfig {
    private SpringSwaggerConfig springSwaggerConfig;

    @Autowired
    public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
        this.springSwaggerConfig = springSwaggerConfig;
    }

    @Bean
    // Don't forget the @Bean annotation
    public SwaggerSpringMvcPlugin customImplementation() {
        return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).
                pathProvider(new SupplierAPISwaggerPathProvider()).
                apiInfo(apiInfo()).
                includePatterns(".*?"); // 只扫描RequestMapping以api开头的Rest API;默认是扫描所以的API接口，即".*?".
    }

    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Open Platform API", "", "", "", "", "");
        // ApiInfo apiInfo = new ApiInfo("My Apps API Title",
        // "My Apps API Description", "My Apps API terms of service",
        // "My Apps API Contact Email", "My Apps API Licence Type",
        // "My Apps API License URL");
        return apiInfo;
    }
}
class SupplierAPISwaggerPathProvider extends SwaggerPathProvider {

    @Override
    protected String applicationPath() {
        // TODO Auto-generated method stub
        return "/torani-supplier";
    }

    @Override
    protected String getDocumentationPath() {
        // TODO Auto-generated method stub
        return "";
    }
}
