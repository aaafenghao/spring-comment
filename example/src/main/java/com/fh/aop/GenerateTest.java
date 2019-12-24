package com.fh.aop;

import org.apache.commons.io.FileUtils;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.IOException;

public class GenerateTest {

	public static void main(String[] args) {
		Class<?>[] classes = new Class[]{Dao.class};
		byte[] lubaAS = ProxyGenerator.generateProxyClass("LubaA", classes);
		try {
			FileUtils.writeByteArrayToFile(new File("D:/ysstech/source/spring-comment/example/out/production/classes/com/fh/aop/Test.class"),lubaAS);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
