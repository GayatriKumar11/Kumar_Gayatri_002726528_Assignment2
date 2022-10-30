/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author gayatrisk
 */
public class PersonDirectory {

    private ArrayList<Person> directory;

    public PersonDirectory() {
        this.directory = new ArrayList<Person>();
    }

    public ArrayList<Person> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Person> directory) {
        this.directory = directory;
    }

    //    Creates new Employee and adds it to the Employee history
//    Returns reference to the newly created Employee
    public Person addNewPerson() {

        Person newPerson = new Person();
        directory.add(newPerson);
        return newPerson;

    }

    public void deleteEmployee(Person person) {
        directory.remove(person);
    }

}
