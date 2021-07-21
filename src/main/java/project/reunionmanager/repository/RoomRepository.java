package project.reunionmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.reunionmanager.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>{
}
