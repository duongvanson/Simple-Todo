package dev.duongson.simpletodo.models;

import java.util.Date;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

import dev.duongson.simpletodo.utils.Strings;

public class ToDoItem {
    private UUID uuid;
    private String nameTodo;
    private Date timeReminder;
    private int color; //8089599

    public ToDoItem(String nameTodo, Date timeReminder) {
        this.nameTodo = nameTodo;
        this.timeReminder = timeReminder;
        this.uuid = UUID.randomUUID();
        this.color = 8089599;
    }

    public ToDoItem() {
    }

    public ToDoItem(JSONObject jo) throws JSONException {
        uuid = UUID.fromString(jo.getString(Strings.ID_TODO));
        nameTodo = jo.getString(Strings.NAME_TODO);
        timeReminder = new Date(jo.getLong(Strings.TIME_REMINDER_TODO));
        color = jo.getInt(Strings.COLOR_TODO);
    }

    public JSONObject toJSon() throws JSONException {
        JSONObject jo = new JSONObject();
        jo.put(Strings.ID_TODO, uuid);
        jo.put(Strings.NAME_TODO, nameTodo);
        jo.put(Strings.TIME_REMINDER_TODO, timeReminder.getTime());
        jo.put(Strings.COLOR_TODO, color);
        return jo;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNameTodo() {
        return nameTodo;
    }

    public void setNameTodo(String nameTodo) {
        this.nameTodo = nameTodo;
    }

    public Date getTimeReminder() {
        return timeReminder;
    }

    public void setTimeReminder(Date timeReminder) {
        this.timeReminder = timeReminder;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}