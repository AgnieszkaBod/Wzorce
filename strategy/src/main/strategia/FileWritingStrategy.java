package main.strategia;

import java.io.IOException;
import java.util.List;

public interface FileWritingStrategy {
    void writeToFile(List<UserDto> users) throws IOException;
}
