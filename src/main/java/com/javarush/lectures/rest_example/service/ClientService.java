package com.javarush.lectures.rest_example.service;

import com.javarush.lectures.rest_example.model.Client;

import java.util.List;

public interface ClientService {


    /**
     * Creates a new Client
     * @param client - client for creation
     */
    void create (Client client);

    /**
     * Returns all clients
     * @return all clients
     */
    List<Client> readAll();

    /**
     * Returns Client by id
     * @param id ID of the Client
     * @return Client by id
     */
    Client read(int id);

    /**
     * Updates Client by ID to the param client
     * @param client updated Client
     * @param id ID of updatable Client
     * @return true if Client updated
     */
    boolean update(Client client, int id);

    /**
     * Deletes Client by ID
     * @param id ID of the Client to delete
     * @return true if the Client was deleted by ID
     */
    boolean delete(int id);
}
