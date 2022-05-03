public class Conversor extends javax.swing.JFrame {
    
    int operacao;
    float curRealDolar=4.5f, curRealEuro=5, curRealLibra=6;
    float curDolarEuro=1.08f, curDolarLibra=1.30f;
    float curEuroLibra=1.20f;
    double resultado, temperatura1, temperatura2;

    public Conversor() {
        initComponents();
        cmbFinal.setSelectedIndex(-1);
        cmbInicial.setSelectedIndex(-1);
        cmbFinalM.setSelectedIndex(-1);
        cmbInicialM.setSelectedIndex(-1);
        cmbInicialT.setSelectedIndex(-1);
        cmbInicialC.setSelectedIndex(-1);
        cmbFinalC.setSelectedIndex(-1);
        cmbInicialA.setSelectedIndex(-1);
        cmbFinalA.setSelectedIndex(-1);
    }
    
    public void tratarConversãoMoeda(){
        
        //Valor Real
        if (cmbInicial.getSelectedItem().equals("Reais (R$)")){
            if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                resultado = Double.parseDouble(txtValor.getText()) / curRealDolar;
            } else {
                if (cmbFinal.getSelectedItem().equals("Euros (€)")){
                    resultado = Double.parseDouble(txtValor.getText()) / curRealEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Double.parseDouble(txtValor.getText()) / curRealLibra;
                    }
                }
            }
        }
        
        //Valor Dólar
        if (cmbInicial.getSelectedItem().equals("Dólares (USD)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Double.parseDouble(txtValor.getText()) * curRealDolar;
            } else {
                if (cmbFinal.getSelectedItem().equals("Euros (€)")){
                    resultado = Double.parseDouble(txtValor.getText()) / curDolarEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Double.parseDouble(txtValor.getText()) / curDolarLibra;
                    }
                }
            }
        }
        
        //Valor Euro
        if (cmbInicial.getSelectedItem().equals("Euros (€)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Double.parseDouble(txtValor.getText()) * curRealEuro;
            } else {
                if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                    resultado = Double.parseDouble(txtValor.getText()) * curDolarEuro;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Libra esterlina (£)")) {
                        resultado = Double.parseDouble(txtValor.getText()) / curEuroLibra;
                    }
                }
            }
        }
        
        //Valor Libra
        if (cmbInicial.getSelectedItem().equals("Libra esterlina (£)")){
            if (cmbFinal.getSelectedItem().equals("Reais (R$)")){
                resultado = Double.parseDouble(txtValor.getText()) * curRealLibra;
            } else {
                if (cmbFinal.getSelectedItem().equals("Dólares (USD)")){
                    resultado = Double.parseDouble(txtValor.getText()) * curDolarLibra;
                } else {
                    if (cmbFinal.getSelectedItem().equals("Euros (€)")) {
                        resultado = Double.parseDouble(txtValor.getText()) * curEuroLibra;
                    }
                }
            }
        }
            
    }

    public void tratarConversãoMassa(){
        //Toneladas 
        if (cmbInicialM.getSelectedItem().equals("Toneladas")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100000f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000000f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000000000f;
            }    
        }
        
        //Quilogramas
        if (cmbInicialM.getSelectedItem().equals("Quilogramas (kg)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100000f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000000f;
            }    
        }
        
        //Hectogramas
        if (cmbInicialM.getSelectedItem().equals("Hectogramas (hg)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100000f;
            }    
        }
        
        //Decagramas
        if (cmbInicialM.getSelectedItem().equals("Decagramas (dag)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10000f;
            }    
        }
        
        //Gramas
        if (cmbInicialM.getSelectedItem().equals("Gramas (g)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText());   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 1000f;
            }    
        }
        
        //Decigramas 
        if (cmbInicialM.getSelectedItem().equals("Decigramas (dg)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 100f;
            }    
        }
        
        //Centigramas
        if (cmbInicialM.getSelectedItem().equals("Centigramas (cg)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100000f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText());
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText()) * 10f;
            }    
        }
        
        //Miligramas
        if (cmbInicialM.getSelectedItem().equals("Miligramas(mg)")){
            if (cmbFinalM.getSelectedItem().equals("Toneladas")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Quilogramas (kg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000000f;
            } else if (cmbFinalM.getSelectedItem().equals("Hectogramas (hg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100000f;
            } else if (cmbFinalM.getSelectedItem().equals("Decagramas (dag)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10000f;
            } else if (cmbFinalM.getSelectedItem().equals("Gramas (g)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 1000f;   
            } else if (cmbFinalM.getSelectedItem().equals("Decigramas (dg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 100f;
            } else if (cmbFinalM.getSelectedItem().equals("Centigramas (cg)")){
                resultado = Double.parseDouble(txtValorM.getText()) / 10f;
            } else if (cmbFinalM.getSelectedItem().equals("Miligramas (mg)")){
                resultado = Double.parseDouble(txtValorM.getText());
            }    
        }
    }
     
    public void tratarConversãoComprimento(){
         
         //Quilômetros
         if (cmbInicialC.getSelectedItem().equals("Quilômetros (km)")){
            if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 1000f;
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10000f;   
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100000f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 1000000f;
            }
        }
         
         //Hectômetros
         if (cmbInicialC.getSelectedItem().equals("Hectômetros (hm)")){
            if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 1000f;   
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10000f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100000f;
            }
        }
         
         //Decâmetros
         if (cmbInicialC.getSelectedItem().equals("Decâmetros (dam)")){
            if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100f;   
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 1000f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10000f;
            }
        }
         
         //Metros
         if (cmbInicialC.getSelectedItem().equals("Metros (m)")){
            if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 1000f;
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;   
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 1000f;
            }
        }
         
         //Decímetros
         if (cmbInicialC.getSelectedItem().equals("Decímetros (dm)")){
            if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10000f;
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 1000f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;   
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 100f;
            }
        }
         
         //Centímetros
         if (cmbInicialC.getSelectedItem().equals("Centímetros (cm)")){
            if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100000f;
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10000f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 1000f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100f;   
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;
            } else if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText()) * 10f;
            }
        }
         
         //Milímetros
         if (cmbInicialC.getSelectedItem().equals("Milímetros (mm)")){
            if (cmbFinalC.getSelectedItem().equals("Milímetros (mm)")){
                resultado = Double.parseDouble(txtValorC.getText());
            } else if (cmbFinalC.getSelectedItem().equals("Quilômetros (km)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 1000000f;
            } else if (cmbFinalC.getSelectedItem().equals("Hectômetros (hm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100000f;
            } else if (cmbFinalC.getSelectedItem().equals("Decâmetros (dam)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10000f;
            } else if (cmbFinalC.getSelectedItem().equals("Metros (m)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 1000f;   
            } else if (cmbFinalC.getSelectedItem().equals("Decímetros (dm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 100f;
            } else if (cmbFinalC.getSelectedItem().equals("Centímetros (cm)")){
                resultado = Double.parseDouble(txtValorC.getText()) / 10f;
            }
        }
     }
     
    public void tratarConversãoÁrea(){
        
        //Quilômetro quadrado
        if (cmbInicialA.getSelectedItem().equals("Quilômetros quadrados (km²)")){
            if (cmbFinalA.getSelectedItem().equals("Quilômetros quadrados (km²)")){
                resultado = Double.parseDouble(txtValorA.getText());
            } else if (cmbFinalA.getSelectedItem().equals("Metros quadrados (m²)")){
                resultado = Double.parseDouble(txtValorA.getText()) * 1000000f;
            } else if (cmbFinalA.getSelectedItem().equals("Hectares")){
                resultado = Double.parseDouble(txtValorA.getText()) * 100f;
            } else if (cmbFinalA.getSelectedItem().equals("Centímetros quadrados (cm²)")){
                resultado = Double.parseDouble(txtValorA.getText()) * Math.pow(10,10);
            }
        }
        
        //Metro quadrado
        if (cmbInicialA.getSelectedItem().equals("Metros quadrados (m²)")){
            if (cmbFinalA.getSelectedItem().equals("Metros quadrados (m²)")){
                resultado = Double.parseDouble(txtValorA.getText());
            } else if (cmbFinalA.getSelectedItem().equals("Quilômetros quadrados (km²)")){
                resultado = Double.parseDouble(txtValorA.getText()) / 1000000f;
            } else if (cmbFinalA.getSelectedItem().equals("Hectares")){
                resultado = Double.parseDouble(txtValorA.getText()) / 10000f;
            } else if (cmbFinalA.getSelectedItem().equals("Centímetros quadrados (cm²)")){
                resultado = Double.parseDouble(txtValorA.getText()) * 10000f;
            }
        }
        
        //Hectare
        if (cmbInicialA.getSelectedItem().equals("Hectares")){
            if (cmbFinalA.getSelectedItem().equals("Hectares")){
                resultado = Double.parseDouble(txtValorA.getText());
            } else if (cmbFinalA.getSelectedItem().equals("Quilômetros quadrados (km²)")){
                resultado = Double.parseDouble(txtValorA.getText()) / 100f;
            } else if (cmbFinalA.getSelectedItem().equals("Metros quadrados (m²)")){
                resultado = Double.parseDouble(txtValorA.getText()) * 10000f;
            } else if (cmbFinalA.getSelectedItem().equals("Centímetros quadrados (cm²)")){
                resultado = Double.parseDouble(txtValorA.getText()) * Math.pow(10,8);
            }
        }
        
        //Centímetro quadrado
        if (cmbInicialA.getSelectedItem().equals("Centímetros quadrados (cm²)")){
            if (cmbFinalA.getSelectedItem().equals("Centímetros quadrados (cm²)")){
                resultado = Double.parseDouble(txtValorA.getText());
            } else if (cmbFinalA.getSelectedItem().equals("Quilômetros quadrados (km²)")){
                resultado = Double.parseDouble(txtValorA.getText()) / Math.pow(10,10);
            } else if (cmbFinalA.getSelectedItem().equals("Metros quadrados (m²)")){
                resultado = Double.parseDouble(txtValorA.getText()) / 10000f;
            } else if (cmbFinalA.getSelectedItem().equals("Hectares")){
                resultado = Double.parseDouble(txtValorA.getText()) / Math.pow(10,8);
            }
        }
    } 
     
    public void tratarConversãoTemperatura(){
         if (cmbInicialT.getSelectedItem().equals("Celsius (°C)")){
             temperatura1 = Double.parseDouble(txtValorT.getText()) + 273;
             temperatura2 = (Double.parseDouble(txtValorT.getText()) * 1.8f) + 32;
             txtResultadoT1.setText(Double.toString(temperatura1));
             lblTemp1.setText("Kelvin (K)");
             txtResultadoT2.setText(Double.toString(temperatura2));
             lblTemp2.setText("Fahrenheit (°F)");
         } else if (cmbInicialT.getSelectedItem().equals("Fahrenheit (°F)")){
             temperatura1 = (Double.parseDouble(txtValorT.getText()) - 32) * 5/9 + 273;
             temperatura2 = (Double.parseDouble(txtValorT.getText()) - 32) /1.8f;
             txtResultadoT1.setText(Double.toString(temperatura1));
             lblTemp1.setText("Kelvin (K)");
             txtResultadoT2.setText(Double.toString(temperatura2));
             lblTemp2.setText("Celsius (°C)");
         } else if (cmbInicialT.getSelectedItem().equals("Kelvin (K)")){
             temperatura1 = (Double.parseDouble(txtValorT.getText()) - 273) * 1.8f + 32;
             temperatura2 = Double.parseDouble(txtValorT.getText()) - 273;
             txtResultadoT1.setText(Double.toString(temperatura1));
             lblTemp1.setText("Fahrenheit(°F)");
             txtResultadoT2.setText(Double.toString(temperatura2));
             lblTemp2.setText("Celsius (°C)");
         }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbFinal = new javax.swing.JComboBox<>();
        cmbInicial = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnConverter = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cmbFinalM = new javax.swing.JComboBox<>();
        cmbInicialM = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtResultadoM = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtValorM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnConverterM = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cmbFinalC = new javax.swing.JComboBox<>();
        cmbInicialC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtResultadoC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtValorC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnConverterC = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        cmbFinalA = new javax.swing.JComboBox<>();
        cmbInicialA = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtResultadoA = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtValorA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnConverterA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cmbInicialT = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtResultadoT1 = new javax.swing.JTextField();
        lblTemp1 = new javax.swing.JLabel();
        txtValorT = new javax.swing.JTextField();
        btnConverterT = new javax.swing.JButton();
        txtResultadoT2 = new javax.swing.JTextField();
        lblTemp2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reais (R$)", "Dólares (USD)", "Euros (€)", "Libra esterlina (£)" }));

        cmbInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reais (R$)", "Dólares (USD)", "Euros (€)", "Libra esterlina (£)" }));

        jLabel2.setText("Converter de");

        jLabel3.setText("Para");

        txtResultado.setEditable(false);

        jLabel4.setText("Valor: ");

        jLabel5.setText("Resultado da Conversão ");

        btnConverter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverter.setText("Converter");
        btnConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(76, 76, 76)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(cmbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(60, 60, 60)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverter)))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnConverter)
                .addGap(27, 27, 27))
        );

        jTabbedPane2.addTab("Moeda", jPanel1);

        cmbFinalM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toneladas", "Quilogramas (kg)", "Hectogramas (hg)", "Decagramas (dag)", "Gramas (g)", "Decigramas (dg)", "Centigramas (cg)", "Miligramas (mg)" }));

        cmbInicialM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toneladas", "Quilogramas (kg)", "Hectogramas (hg)", "Decagramas (dag)", "Gramas (g)", "Decigramas (dg)", "Centigramas (cg)", "Miligramas (mg)" }));

        jLabel6.setText("Converter de");

        jLabel7.setText("Para");

        txtResultadoM.setEditable(false);

        jLabel8.setText("Valor: ");

        jLabel9.setText("Resultado da Conversão ");

        btnConverterM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverterM.setText("Converter");
        btnConverterM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbInicialM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmbFinalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(64, 64, 64))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtValorM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultadoM, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverterM)))
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicialM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFinalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnConverterM)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Massa", jPanel3);

        cmbFinalC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quilômetros (km)", "Hectômetros (hm)", "Decâmetros (dam)", "Metros (m)", "Decímetros (dm)", "Centímetros (cm)", "Milímetros (mm)" }));

        cmbInicialC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quilômetros (km)", "Hectômetros (hm)", "Decâmetros (dam)", "Metros (m)", "Decímetros (dm)", "Centímetros (cm)", "Milímetros (mm)" }));

        jLabel11.setText("Converter de");

        jLabel12.setText("Para");

        txtResultadoC.setEditable(false);

        jLabel13.setText("Valor: ");

        jLabel14.setText("Resultado da Conversão ");

        btnConverterC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverterC.setText("Converter");
        btnConverterC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel11)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbInicialC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmbFinalC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(64, 64, 64))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtValorC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverterC)))
                .addGap(44, 44, 44))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicialC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFinalC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnConverterC)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Comprimento", jPanel6);

        cmbFinalA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quilômetros quadrados (km²)", "Metros quadrados (m²)", "Centímetros quadrados (cm²)", "Hectares" }));

        cmbInicialA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quilômetros quadrados (km²)", "Metros quadrados (m²)", "Centímetros quadrados (cm²)", "Hectares" }));

        jLabel15.setText("Converter de");

        jLabel16.setText("Para");

        txtResultadoA.setEditable(false);

        jLabel17.setText("Valor: ");

        jLabel18.setText("Resultado da Conversão ");

        btnConverterA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverterA.setText("Converter");
        btnConverterA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(103, 103, 103))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmbInicialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbFinalA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(txtValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtResultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverterA)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicialA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFinalA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnConverterA)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Área", jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane2.addTab("Unidades de Medida", jPanel2);

        cmbInicialT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius (°C)", "Fahrenheit (°F)", "Kelvin (K)" }));

        jLabel10.setText("Converter de:");

        txtResultadoT1.setEditable(false);

        lblTemp1.setText("   ");

        btnConverterT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConverterT.setText("Converter");
        btnConverterT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverterTActionPerformed(evt);
            }
        });

        txtResultadoT2.setEditable(false);

        lblTemp2.setText("   ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnConverterT))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(txtResultadoT1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtResultadoT2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtValorT, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(47, 47, 47)
                        .addComponent(cmbInicialT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTemp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTemp2)
                        .addGap(105, 105, 105))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbInicialT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addComponent(txtValorT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp1)
                    .addComponent(lblTemp2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnConverterT)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Temperatura", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterActionPerformed
        tratarConversãoMoeda();
        txtResultado.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConverterActionPerformed

    private void btnConverterMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterMActionPerformed
        tratarConversãoMassa();
        txtResultadoM.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConverterMActionPerformed

    private void btnConverterTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterTActionPerformed
        tratarConversãoTemperatura();
    }//GEN-LAST:event_btnConverterTActionPerformed

    private void btnConverterCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterCActionPerformed
        tratarConversãoComprimento();
        txtResultadoC.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConverterCActionPerformed

    private void btnConverterAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverterAActionPerformed
        tratarConversãoÁrea();
        txtResultadoA.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnConverterAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConverter;
    private javax.swing.JButton btnConverterA;
    private javax.swing.JButton btnConverterC;
    private javax.swing.JButton btnConverterM;
    private javax.swing.JButton btnConverterT;
    private javax.swing.JComboBox<String> cmbFinal;
    private javax.swing.JComboBox<String> cmbFinalA;
    private javax.swing.JComboBox<String> cmbFinalC;
    private javax.swing.JComboBox<String> cmbFinalM;
    private javax.swing.JComboBox<String> cmbInicial;
    private javax.swing.JComboBox<String> cmbInicialA;
    private javax.swing.JComboBox<String> cmbInicialC;
    private javax.swing.JComboBox<String> cmbInicialM;
    private javax.swing.JComboBox<String> cmbInicialT;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblTemp1;
    private javax.swing.JLabel lblTemp2;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultadoA;
    private javax.swing.JTextField txtResultadoC;
    private javax.swing.JTextField txtResultadoM;
    private javax.swing.JTextField txtResultadoT1;
    private javax.swing.JTextField txtResultadoT2;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtValorA;
    private javax.swing.JTextField txtValorC;
    private javax.swing.JTextField txtValorM;
    private javax.swing.JTextField txtValorT;
    // End of variables declaration//GEN-END:variables
}
