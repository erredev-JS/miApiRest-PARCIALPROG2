package com.example.MiApiRest.entities;

import com.example.MiApiRest.entities.enums.FormaPago;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Factura extends Base implements Serializable {
    private LocalDate fachaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;



}
