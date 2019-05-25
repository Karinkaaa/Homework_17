package serialization;

import java.io.*;

public class User implements Serializable, Externalizable {

    private String name;
    private String surname;
    private int age;

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer("\nUSER:\n");
        sb.append("Name: ").append(this.name).append("\nSurname: ").append(this.surname);
        sb.append("\nAge: ").append(this.age);
        return sb.toString();
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.age);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.age = (Integer) in.readObject();
    }
}
