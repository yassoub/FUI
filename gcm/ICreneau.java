package gcm;

import java.util.List;

public interface ICreneau {
void addCreneau(Creneau c);
void updateCreneau(Creneau c);
void deleteCreneau(int id);
Creneau getCreneau(int id);
List<Creneau> getCreneaux();

}
