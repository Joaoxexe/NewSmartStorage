<%-- 
    Document   : salvarEndereco
    Created on : 05/11/2019, 12:50:47
    Author     : João Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Endereço</title>
    </head>
    <body>
        <h1>Cadastro de Endereço</h1>
        <form action="../ServletSalvarEndereco" method="post">
           <table class="table">         
                    <tr>
                        <td>
                            País: <input type="text" name="pais">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Cidade: <input type="text" name="cidade">
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            Bairro: <input type="text" name="bairro">
                        </td>                        
                    </tr>
                    
                    <tr>
                        <td>
                            CEP: <input type="text" name="cep">
                        </td>
                    </tr>
                       
                    <tr>
                        <td>
                            Lodragouro: <input type="text" name="logradouro">
                        </td>                           
                    </tr>
                    
                    <tr>
                        <td>
                            Tipo do Logradouro: <input type="text" name="tipoLog">
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            UF: <input type="text" name="uf">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Salvar Endereço">
                        </td>
                    </tr> 
            </table>
        </form>        
    </body>
</html>