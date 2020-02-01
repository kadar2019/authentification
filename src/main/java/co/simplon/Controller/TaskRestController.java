package co.simplon.Controller;
        /*
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;
        import org.springframework.stereotype.Controller;
        */

import co.simplon.dao.TaskRepository;
import co.simplon.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskRestController {
    @Autowired
    private TaskRepository taskRepository;
    @GetMapping(value="/tasks",produces="application/json")
    @ResponseBody
    public List<Task> listTasks(){
        return taskRepository.findAll();
    }
    @PostMapping(value="/tasks",produces="application/json")
    @ResponseBody
    public Task save(@RequestBody Task t){
        return taskRepository.save(t);
    }
}