package net.guides.springboot2.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
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

	@After("execution(* net.guides.springboot2.springaop.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint) 
    {
		LOGGER.debug("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* net.guides.springboot2.springaop.service.EmployeeService.getEmployeeById(..))")
    public void logAfterGetEmployee(JoinPoint joinPoint) 
    {
    	LOGGER.debug("****LoggingAspect.logAfterGetEmployee() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* net.guides.springboot2.springaop.service.EmployeeService.addEmployee(..))")
    public void logAfterAddEmployee(JoinPoint joinPoint) 
    {
    	LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* net.guides.springboot2.springaop.service.EmployeeService.deleteEmployee(..))")
    public void logAfterDeleteEmployee(JoinPoint joinPoint) 
    {
    	LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }
    
    @After("execution(* net.guides.springboot2.springaop.service.EmployeeService.getAllEmployees(..))")
    public void logAfterGetAllEmployees(JoinPoint joinPoint) 
    {
    	LOGGER.debug("****LoggingAspect.logAfterCreateEmployee() : " + joinPoint.getSignature().getName());
    }
}
