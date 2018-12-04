/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author SunnyPC
 */
public class PhonebookEntry {

	private String name;
	private String phoneNumber;
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public String getPhoneNumber() {
	    return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
    }

	public String Entry() {
		return "Name:" +name+". Number:" +phoneNumber+"!";
	}


public static void main(String[] args) {



        }
    }







