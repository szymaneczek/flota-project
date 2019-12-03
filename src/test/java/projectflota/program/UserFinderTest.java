package projectflota.program;

import org.junit.Test;
import org.mockito.Mockito;
import projectflota.program.entity.CarUser;
import projectflota.program.repository.CarUserRepository;

import java.util.Arrays;
import java.util.List;

public class UserFinderTest {
    private CarUserRepository carUserRepository = Mockito.mock(CarUserRepository.class);

    private UserFinder userFinder = new UserFinder(carUserRepository);

    @Test
    public void shouldReturnAllUsers(){
        //given
        List<CarUser> userEntities = Arrays.asList(
                CarUser.builder().name("Jan").surname("Kowalski").build(),
                CarUser.builder().name("Michal").surname("Szymanski").build(),
                CarUser.builder().name("Jakub").surname("Shymanski").build());

        Mockito.when(carUserRepository.findAll()).thenReturn(userEntities);

    }

}


