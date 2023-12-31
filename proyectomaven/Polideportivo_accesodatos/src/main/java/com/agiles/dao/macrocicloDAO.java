/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agiles.dao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.agiles.conexion.Conexion;
import com.agiles.entidades.Macrociclo;
import org.bson.Document;

/**
 *
 * @author rjsaa
 */
public class macrocicloDAO {

    Conexion conexion;
    
    public macrocicloDAO() {
        conexion = new Conexion();
    }
    
    public void setConexion(Conexion conexion){
        this.conexion = conexion;
    }
    
    /**
     * Método que guarda en la BD el Macrociclo enviado como parametro.
     * @param macrociclo
     * @return 
     */
    public Object guardarMacrociclo(Macrociclo macrociclo){
        
        
        try{
            MongoClient mongoClient = conexion.crearConexion();
        
            MongoDatabase database = mongoClient.getDatabase("polideportivo");
        
            MongoCollection<Document> collection = database.getCollection("macrociclos");
            
            Document document = new Document()
                .append("fechaInicio", macrociclo.getFechaInicio())
                .append("fechaFin", macrociclo.getFechaFin())
                .append("deporte", macrociclo.getDeporte())
                .append("rama", macrociclo.getRama())
                .append("jefeRama", macrociclo.getJefeRama())
                .append("preparadorFis", macrociclo.getPreparadorFis())
                .append("Metodologo", macrociclo.getMetodologo())
                .append("periodoPreparativo", macrociclo.getPeriodoPreparativo())
                .append("periodoCompetitivo", macrociclo.getPeriodoCompetitivo())
                .append("totalSemanas", macrociclo.getTotalSemanas())
                .append("etapaPreparativa", macrociclo.getEtapaPreparativa())
                .append("etapaEspecial", macrociclo.getEtapaEspecial())
                .append("etapaPrecompetitiva", macrociclo.getEtapaPrecompetitiva())
                .append("etapaCompetitiva", macrociclo.getEtapaCompetitiva())
                .append("distribucionPreparativa", macrociclo.getDistribucionPreparativa())
                .append("distribucionEspecial", macrociclo.getDistribucionEspecial())
                .append("distribucionPrecom", macrociclo.getDistribucionPrecom())
                .append("distribucionCompetitiva", macrociclo.getDistribucionCompetitiva())
                .append("ciclicidadPreparativa", macrociclo.getCiclicidadPreparativa())
                .append("ciclicidadEspecial", macrociclo.getCiclicidadEspecial())
                .append("ciclicidadPrecom", macrociclo.getCiclicidadPrecom())
                .append("ciclicidadCompetitiva", macrociclo.getCiclicidadCompetitiva());

            
            Object insertedId = document.get("_id");
            
            collection.insertOne(document);
            
            insertedId = document.get("_id");
            
            mongoClient.close();

            return insertedId;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

        

    }
    /**
     * Método que guarda en BD al macrociclo enviado por parámetro
     * @param macrociclo
     * @return 
     */
        public boolean guardarMacrocicloD(Macrociclo macrociclo){
        
        
        try{
            //MongoClient mongoClient = conexion.crearConexion();
        
           // MongoDatabase database = mongoClient.getDatabase("polideportivo");
        
            //MongoCollection<Document> collection = database.getCollection("macrociclos");
            
            Document document = new Document()
                .append("fechaInicio", macrociclo.getFechaInicio())
                .append("fechaFin", macrociclo.getFechaFin())
                .append("deporte", macrociclo.getDeporte())
                .append("rama", macrociclo.getRama())
                .append("jefeRama", macrociclo.getJefeRama())
                .append("preparadorFis", macrociclo.getPreparadorFis())
                .append("Metodologo", macrociclo.getMetodologo())
                .append("periodoPreparativo", macrociclo.getPeriodoPreparativo())
                .append("periodoCompetitivo", macrociclo.getPeriodoCompetitivo())
                .append("totalSemanas", macrociclo.getTotalSemanas())
                .append("etapaPreparativa", macrociclo.getEtapaPreparativa())
                .append("etapaEspecial", macrociclo.getEtapaEspecial())
                .append("etapaPrecompetitiva", macrociclo.getEtapaPrecompetitiva())
                .append("etapaCompetitiva", macrociclo.getEtapaCompetitiva())
                .append("distribucionPreparativa", macrociclo.getDistribucionPreparativa())
                .append("distribucionEspecial", macrociclo.getDistribucionEspecial())
                .append("distribucionPrecom", macrociclo.getDistribucionPrecom())
                .append("distribucionCompetitiva", macrociclo.getDistribucionCompetitiva())
                .append("ciclicidadPreparativa", macrociclo.getCiclicidadPreparativa())
                .append("ciclicidadEspecial", macrociclo.getCiclicidadEspecial())
                .append("ciclicidadPrecom", macrociclo.getCiclicidadPrecom())
                .append("ciclicidadCompetitiva", macrociclo.getCiclicidadCompetitiva());
            System.out.println(document);
            //collection.insertOne(document);
            
            //mongoClient.close();

        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

        
        return true;
    }
}
