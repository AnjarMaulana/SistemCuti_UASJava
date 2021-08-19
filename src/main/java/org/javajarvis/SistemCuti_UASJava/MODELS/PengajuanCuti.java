package org.javajarvis.SistemCuti_UASJava.MODELS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.ast.Var;

import javax.persistence.*;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.Date;

@Entity
@Table(name = "tbl_pengajuan_cuti")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PengajuanCuti implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hrd_id", nullable = false, unique = true)
    private Integer hrd_id;

    @Column(name = "alamat", nullable = false )
    private String alamat;

    @Column (name = "no_telp", nullable = false)
    private String no_telp;

    @Column (name = "keterangan", nullable = false)
    private String keterangan;

    @Column (name = "lama_cuti", nullable = false)
    private Integer lama_cuti;

    @Column (name = "created_by", nullable = false)
    private String created_by;

    @Column (name = "created_date", nullable = false)
    private Date created_date;

    @Column (name = "last_modify_by", nullable = false)
    private String last_modify_by;

    @Column (name = "last_modify_date", nullable = false)
    private Date last_modify_date;



}
