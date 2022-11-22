package br.com.rezende.package_info;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleNameTest {

    @Test
    public void testModuleName() {
        ModuleName myPackageAnnotations = this.getClass().getPackage().getAnnotation(ModuleName.class);
        assertEquals("XPTO", myPackageAnnotations.value());
    }
}
