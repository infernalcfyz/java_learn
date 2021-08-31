package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
    private int id = Integer.MAX_VALUE;;
    private String group_name;
    private String group_header;
    private String group_footer;

    public GroupData withheader(String group_header) {
        this.group_header = group_header;
        return this;
    }

    public GroupData withfooter(String group_footer) {
        this.group_footer = group_footer;
        return this;
    }

    public GroupData withName(String group_name) {
        this.group_name = group_name;
        return this;
    }

    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    public String getGroup_name () {return group_name;}

    public int getId() {
        return id;
    }

    public String getGroup_header() {return group_header;}

    public String getGroup_footer() {return group_footer;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(group_name, groupData.group_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group_name);
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", group_name='" + group_name + '\'' +
                '}';
    }


}
