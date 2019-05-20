package net.guides.springboot2.springaop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging execution.
 * 
 * @author Ramesh Fadatare
 *
 */
@Aspect
@Component
public class LoggingAspect {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning("execution(* net.guides.springboot2.springaop.service.EmployeeService.*(..))")
    public void logAfterReturningAllMethods() throws Throwable 
    {
		LOGGER.debug("****LoggingAspect.logAfterReturningAllMethods() ");
    }

    @AfterReturning(pointcut="execution(* net.guides.springboot2.springaop.service.EmployeeService.getEmployeeById(..))", returning="retVal") 
    public void logAfterReturningGetEmployee(Object retVal) throws Throwable 
    {
    	LOGGER.debug("****LoggingAspect.logAfterReturningGetEmployee() ");
    }

    @AfterReturning("execution(* net.guides.springboot2.springaop.service.EmployeeService.addEmployee(..))")
    public void logAfterReturningAddEmployee() throws Throwable 
    {
    	LOGGER.debug("****LoggingAspect.logAfterReturningAddEmployee() ");
    }
}
