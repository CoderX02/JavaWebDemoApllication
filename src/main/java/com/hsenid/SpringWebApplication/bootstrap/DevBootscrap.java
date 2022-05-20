package com.hsenid.SpringWebApplication.bootstrap;

import com.hsenid.SpringWebApplication.models.Project;
import com.hsenid.SpringWebApplication.repositories.EmployeeRepository;
import com.hsenid.SpringWebApplication.repositories.ProjectRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootscrap implements ApplicationListener<ContextRefreshedEvent> {

    private EmployeeRepository employeeRepository;
    private ProjectRepository projectRepository;

    public DevBootscrap(EmployeeRepository employeeRepository, ProjectRepository projectRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {
        //Rithika
        Employee rithika = new Employee("Rithika","Hettiarachchi");
        Project demoproject = new Project("SpringBootDemoApplication","Jaliya sampath");
        rithika.getProjects().add(demoproject);
        demoproject.getEmployees().add(rithika);

        employeeRepository.save(rithika);
        projectRepository.save(demoproject);
    }


}
