package at.home.api;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingListApiImplTest {

    private final ShoppingListApiImpl shoppingListApi = new ShoppingListApiImpl();

    @Test
    public void shouldHaveThreeItems(){
        assertEquals(3, shoppingListApi.listShoppingItems().size());
    }

}
