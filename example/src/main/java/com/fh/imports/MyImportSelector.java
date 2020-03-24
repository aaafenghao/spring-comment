package com.fh.imports;

import com.fh.imports.dao.TestDaoImpl3;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 可以做开关
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{TestDaoImpl3.class.getName()};
	}
}
