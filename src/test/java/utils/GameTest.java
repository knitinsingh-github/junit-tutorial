package utils;

import com.junit.utils.Game;
import com.junit.utils.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    Player player;

    @InjectMocks
    Game game;

    @Test
    public void attackWithSwordTest() throws Exception {
        Mockito.when(player.getWeapon()).thenReturn("Sword");

        assertEquals("Player attack with: Sword", game.attack());
    }

}