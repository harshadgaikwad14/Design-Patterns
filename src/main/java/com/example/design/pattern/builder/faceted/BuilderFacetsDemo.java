package com.example.design.pattern.builder.faceted;
class BuilderFacetsDemo
{
  public static void main(String[] args)
  {
    PersonBuilder pb = new PersonBuilder();
    Person person = pb
      .lives()
        .at("123 London Road")
        .in("London")
        .withPostcode("SW12BC")
      .works()
        .at("Fabrikam")
        .asA("Engineer")
        .earning(123000)
      .build();
    System.out.println(person);
  }
}