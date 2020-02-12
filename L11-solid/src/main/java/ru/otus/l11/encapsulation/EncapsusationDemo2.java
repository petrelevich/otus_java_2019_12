package ru.otus.l11.encapsulation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class CompanyUnmodifiableDepartments {
  private Set<Department> departments = new HashSet<>();

  public Set<Department> getDepartments() {
    return Collections.unmodifiableSet(departments);
  }
}

public class EncapsusationDemo2 {

  public static void main(String[] args) {
    CompanyUnmodifiableDepartments company = new CompanyUnmodifiableDepartments();
    var departments = company.getDepartments();
    departments.add(new Department());
  }

}
