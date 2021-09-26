package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private String title;
    private String desc;
    private String current_date;
    private String category;
    private String due_date;

    public TodoItem(String title, String desc){
        this.title=title;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date()); 
    }
    
    public TodoItem(String category,String title,String desc,String due_date) {
    	this.category = category;
    	this.title=title;
        this.desc=desc;
        this.due_date = due_date;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date());
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }
    
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}
    
    public String toSaveString() {
    	return this.getCategory()+"##"+this.getTitle()+"##"+this.getDesc()+"##"+this.getDue_date()+"##"+
    			this.getCurrent_date()+"\n";
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + this.getCategory()+ "] " + this.getTitle() + " - " + this.getDesc() + " - " +
				this.getDue_date() + " - " + this.getCurrent_date();
	}
}
