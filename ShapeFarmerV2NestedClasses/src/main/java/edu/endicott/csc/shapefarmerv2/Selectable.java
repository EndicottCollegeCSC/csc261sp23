/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.endicott.csc.shapefarmerv2;

/**
 *
 * @author hfeild
 */
public interface Selectable {
    public boolean isSelected();
    public void select();
    public void deselect();
    public boolean wasClicked(int x, int y);
}
