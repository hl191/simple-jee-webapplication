package at.home.api;

import org.openapitools.api.ShoppingListApi;
import org.openapitools.model.ShoppingItem;

import java.util.Arrays;
import java.util.List;

public class ShoppingListApiImpl implements ShoppingListApi {

    @Override
    public List<ShoppingItem> listShoppingItems() {
        return Arrays.asList(new ShoppingItem().id(1L).name("Butter").priority(0), new ShoppingItem().id(2L).name("Zimt").priority(2), new ShoppingItem().id(3L).name("Marillen"));
    }
}
