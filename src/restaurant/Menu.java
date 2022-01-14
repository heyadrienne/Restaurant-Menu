package restaurant;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private final String RESTAURANTNAME = null;
    private String categories;
    private HashMap<String, Arrays> menuItems;
    private Date lastUpdated;

    public Menu (){};

    public Menu(String categories, HashMap<String, Arrays> menuItems, Date lastUpdated) {
        this.categories = categories;
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public String getRESTAURANTNAME() {
        return RESTAURANTNAME;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public HashMap<String, Arrays> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, Arrays> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
