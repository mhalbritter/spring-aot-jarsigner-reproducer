package dependency;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
class DependencyAutoConfiguration {
    @ConditionalOnMissingBean
    @Bean
    SomeBean someBean() {
        return new SomeBean();
    }
}
