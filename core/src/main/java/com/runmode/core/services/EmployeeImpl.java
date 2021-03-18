package com.runmode.core.services;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(service = Employee.class)
@Designate(ocd = EmployeeImpl.EmployeeConfig.class)
public class EmployeeImpl implements Employee{

    @ObjectClassDefinition(name = "Employee Configuration")
    @interface EmployeeConfig {
        @AttributeDefinition(name = "Employee type name")
        String getEmployeeType() default "CEO";
    }

    public void sendEmployeeData(){
    }
}
