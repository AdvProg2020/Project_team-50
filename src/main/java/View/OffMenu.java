package view;

public class OffMenu extends Menu{
    public OffMenu(Menu parentMenu) {
        super("OffMenu", parentMenu);
        this.setSubmenus(submenus);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void execute() {
        super.execute();
    }
}
