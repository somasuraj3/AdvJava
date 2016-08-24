package com.sh.spring05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public IBox getBoxB1() {
		IBox b1 = new Box(2, 3, 4);
		return b1;
	}
	@Bean(name={"b2"})
	public IBox getBoxB2() {
		IBox b2 = new Box();
		b2.setLength(3);
		b2.setBreadth(4);
		b2.setHeight(5);
		return b2;
	}
}


