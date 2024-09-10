package com.studs.STUD_MNG_SYS.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="students")
public class Student {

    @Id
    private String _id;
    private String name;
    private String contact;
    private String address;
    private String pincode;

    public Student(String _id, String name, String contact, String address, String pincode){
        this._id = _id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.pincode = pincode;
    }

    public Student(){

    }

    public String get_id(){
        return _id;
    }

    public void set_id(String _id){
        this._id = _id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContact(){
        return contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPincode(){
        return pincode;
    }

    public void setPincode(String pincode){
        this.pincode = pincode;
    }

    @Override
    public String toString(){
        return "Student{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
