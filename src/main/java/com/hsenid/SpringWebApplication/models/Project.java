package com.hsenid.SpringWebApplication.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String supervisor;

    @ManyToMany
    @JoinTable(name = "project_employee", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "employees_id"))
    private Set<Employee> employees = new HashSet<>();

    public Project() {
    }

    public Project(String title, String supervisor) {
        this.title = title;
        this.supervisor = supervisor;
    }

    public Project(String title, String supervisor, Set<Employee> employees) {
        this.title = title;
        this.supervisor = supervisor;
        this.employees = employees;
    }

    public Long getProjectId() {
        return id;
    }

    public void setProjectId(Long projectid) {
        this.id = projectid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        return id != null ? id.equals(project.id) : project.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String   toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", employees=" + employees +
                '}';
    }
}
