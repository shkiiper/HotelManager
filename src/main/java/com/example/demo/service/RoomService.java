// RoomService.java
package com.example.demo.service;

import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Long id, Room roomDetails) {
        // Получаем существующую комнату по ID
        Room existingRoom = roomRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Room not found with id: " + id));

        // Копируем значения из roomDetails в существующую комнату
        existingRoom.setNumber(roomDetails.getNumber());
        existingRoom.setType(roomDetails.getType());
        existingRoom.setPrice(roomDetails.getPrice());
        existingRoom.setAvailable(roomDetails.getAvailable());

        // Сохраняем обновленную сущность
        return roomRepository.save(existingRoom);
    }




    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
