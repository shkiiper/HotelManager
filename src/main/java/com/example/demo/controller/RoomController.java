package com.example.demo.controller;

import com.example.demo.entity.Room;
import com.example.demo.service.RoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        List<Room> rooms = roomService.getAllRooms();
        model.addAttribute("rooms", rooms);
        return "RoomList";
    }

    @GetMapping("/{id}")
    public String getRoomById(@PathVariable Long id, Model model) {
        Room room = roomService.getRoomById(id);
        model.addAttribute("room", room);
        return "RoomDetails";
    }

    @GetMapping("/new")
    public String createRoomForm(Model model) {
        model.addAttribute("room", new Room());
        return "RoomForm";
    }


    @PostMapping
    public String createRoom(@ModelAttribute Room room) {
        roomService.createRoom(room);
        return "redirect:/rooms";
    }

    @GetMapping("/{id}/edit")
    public String updateRoomForm(@PathVariable Long id, Model model) {
        Room room = roomService.getRoomById(id);
        model.addAttribute("room", room);
        return "RoomForm";
    }

    @PostMapping("/{id}")
    public String updateRoom(@PathVariable Long id, @ModelAttribute Room roomDetails) {
        roomDetails.setId(id);
        roomService.updateRoom(id, roomDetails);
        return "redirect:/rooms";
    }


    @PostMapping("/{id}/delete")
    public String deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return "redirect:/rooms";
    }
}
