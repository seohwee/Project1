package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
	private int id;
	private String category;
    private String title;
    private String desc;
    private String current_date;
    private String due_date;
    private int is_completed;
	private String importance;
	private String alarm;


    public TodoItem(int id, String title, int is_completed, String desc, String category, String due_date, String importance, String alarm){
        this.id=id;
    	this.category=category;
    	this.title=title;
        this.due_date=due_date;
        this.desc=desc;
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date=f.format(new Date());
        this.is_completed=is_completed;
        this.importance=importance;
        this.alarm=alarm;
    }
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
    
	public void setId(int id) {
		this.id = id;
	}
	
    public String getCategory() {
    	return category;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setCategory(String category) {
    	this.category = category;
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
    
    public String getDue_date() {
    	return due_date;
    }

    public void setCurrent_date(String current_date) {
        this.current_date = current_date;
    }
    
    public void setDue_date(String due_date) {
    	this.due_date = due_date;
    }
    
    public void setImportance(String importance) {
    	this.importance = importance;
    }
    
    public String getImportance() {
    	return importance;
    }
    
    public void setAlarm(String alarm) {
    	this.alarm = alarm;
    }
    
    public String getAlarm() {
    	return alarm;
    }
    
    @Override
    public String toString() {
    	if(is_completed == 1) {
    		return "[" + category + "] " + title+"[V]" + " - " + desc + " - " + due_date + " - " + current_date + " - " + importance + " - " + alarm;
    
    	}
    	else if(is_completed == 0) {
    		return "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date + " - " + importance + " - " + alarm;
    	}
		return "[" + category + "] " + title + " - " + desc + " - " + due_date + " - " + current_date + " - " + importance + " - " + alarm;
    }
    
    public String toSaveString() {
    	return category + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + " - " + importance + " - " + alarm + "\n";
    }
    
    public void setIs_completed(int is_completed) {
    	this.is_completed = is_completed;
    }
    public int getIs_completed() {
    	return is_completed;
    }

}