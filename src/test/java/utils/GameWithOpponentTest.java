package utils;

import com.junit.utils.GameWithOpponent;
import com.junit.utils.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameWithOpponentTest {

    @Mock Player player;

    @Spy
    List<String> enemies = new ArrayList<>();

    @InjectMocks
    GameWithOpponent game;

    @Test public void attackWithSwordTest() throws Exception {
        Mockito.when(player.getWeapon()).thenReturn("Sword");

        enemies.add("Dragon");
        enemies.add("Orc");

        assertEquals(2, game.numberOfEnemies());

        assertEquals("Player attack with: Sword", game.attack());
    }
}
