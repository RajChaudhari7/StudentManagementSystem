package com.sms;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentController {

    public static void show(Stage stage) {
        TextField idField = new TextField();
        TextField nameField = new TextField();
        TextField emailField = new TextField();
        TextField courseField = new TextField();

        Button addBtn = new Button("Add");
        Button updateBtn = new Button("Update");
        Button deleteBtn = new Button("Delete");
        Button viewBtn = new Button("View Students");

        addBtn.setOnAction(e -> addStudent(
                nameField.getText(),
                emailField.getText(),
                courseField.getText()
        ));

        updateBtn.setOnAction(e -> updateStudent(
                idField.getText(),
                nameField.getText(),
                emailField.getText(),
                courseField.getText()
        ));

        deleteBtn.setOnAction(e -> deleteStudent(idField.getText()));

        viewBtn.setOnAction(e -> ViewStudentsController.show(stage));

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        grid.add(new Label("ID:"), 0, 0);
        grid.add(idField, 1, 0);
        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);
        grid.add(new Label("Email:"), 0, 2);
        grid.add(emailField, 1, 2);
        grid.add(new Label("Course:"), 0, 3);
        grid.add(courseField, 1, 3);

        grid.add(addBtn, 0, 4);
        grid.add(updateBtn, 1, 4);
        grid.add(deleteBtn, 0, 5);
        grid.add(viewBtn, 1, 5);

        stage.setScene(new Scene(grid, 420, 350));
        stage.setTitle("Student Management (MySQL)");
    }

    private static void addStudent(String name, String email, String course) {
        String sql = "INSERT INTO students(name,email,course) VALUES(?,?,?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void updateStudent(String id, String name, String email, String course) {
        String sql = "UPDATE students SET name=?, email=?, course=? WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, course);
            ps.setInt(4, Integer.parseInt(id));
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(String id) {
        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, Integer.parseInt(id));
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
