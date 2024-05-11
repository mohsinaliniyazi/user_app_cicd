package com.userapplication.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
public abstract class AuditModel implements Serializable {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@CreatedDate
	    @Column
	    private LocalDateTime  createdAt;
	 
	    @LastModifiedDate
	    @Column
	    private LocalDateTime  updatedAt;
	 
	    public LocalDateTime  getCreatedAt() {
	        return createdAt;
	    }
	 
	    public void setCreatedAt(LocalDateTime  createdAt) {
	        this.createdAt = createdAt;
	    }
	 
	    public LocalDateTime  getUpdatedAt() {
	        return updatedAt;
	    }
	 
	    public void setUpdatedAt(LocalDateTime  updatedAt) {
	        this.updatedAt = updatedAt;
	    }
}
