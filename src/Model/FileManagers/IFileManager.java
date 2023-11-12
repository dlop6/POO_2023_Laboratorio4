package Model.FileManagers;

import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import Model.BasicObjects.User;

public interface IFileManager {
    public void SaveUser(ArrayList<User> users) throws ParserConfigurationException;
    public ArrayList<User> LoadUsers();
}