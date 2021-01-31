package metaL.gui;

import javax.swing.JFrame;
import metaL.core.Object;

public class Frame extends GUI {
  private JFrame frame;

  public Frame(Object that) {
    super(that);
    this.frame = new JFrame(this.value);
  }
}
