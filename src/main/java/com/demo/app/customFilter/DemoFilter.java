package com.demo.app.customFilter;

import org.apache.apisix.plugin.runner.HttpRequest;
import org.apache.apisix.plugin.runner.HttpResponse;
import org.apache.apisix.plugin.runner.filter.PluginFilter;
import org.apache.apisix.plugin.runner.filter.PluginFilterChain;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DemoFilter implements PluginFilter {

	@Override
	public String name() {
		return "DemoFilter";
	}

	@Override
	public void filter(HttpRequest request, HttpResponse response, PluginFilterChain chain) {

		log.info("--------------YES--------------");

		chain.filter(request, response);
	}

}
