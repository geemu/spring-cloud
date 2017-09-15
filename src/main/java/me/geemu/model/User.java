package me.geemu.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Author: 陈方明
 * Email: cfmmail@sina.com
 * Date: 2017/9/14 18:07
 * Description: 这边不知道为什么不能用lombok注解，会失效
 */
@Document(collection="mytable")
public class User implements Serializable {
    private static final long serialVersionUID = 310870463205713387L;

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;

    public User() {
    }


    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        final User other = (User) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        if (this.getAge() != other.getAge()) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        result = result * PRIME + this.getAge();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof User;
    }

    public String toString() {
        return "me.geemu.model.User(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", age=" + this.getAge() + ")";
    }
}
