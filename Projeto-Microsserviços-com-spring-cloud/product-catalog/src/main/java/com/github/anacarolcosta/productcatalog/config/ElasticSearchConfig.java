package com.github.anacarolcosta.productcatalog.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.github.anacarolcosta.productcatalog.repository")
@ComponentScan(basePackages = {"com.github.anacarolcosta.productcatalog"})
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration implements ElasticSearchConfigOverride {

    //@Override
    @Bean
    public RestHighLevelClient elasticsearchCLient() {
        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                .connectedTo("localhost:9200", "localhost:9300")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }

    @Override
    public RestHighLevelClient elasticsearchClient() {
        return null;
    }
}
