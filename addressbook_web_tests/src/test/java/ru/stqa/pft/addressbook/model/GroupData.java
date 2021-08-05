package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
    private final String id;
    private final String group_name;
    private final String group_header;
    private final String group_footer;

    public GroupData(String id, String group_name, String group_header, String group_footer) {
        this.id = id;
        this.group_name = group_name;
        this.group_header = group_header;
        this.group_footer = group_footer;
    }

    public GroupData(String group_name, String group_header, String group_footer) {
        this.id = null;
        this.group_name = group_name;
        this.group_header = group_header;
        this.group_footer = group_footer;
    }

    public String getGroup_name () {return group_name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(id, groupData.id) && Objects.equals(group_name, groupData.group_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, group_name);
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", group_name='" + group_name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getGroup_header() {return group_header;}

    public String getGroup_footer() {return group_footer;}

}
