package com.techmisal.forme.repository;

import com.techmisal.forme.databaseModels.Companies;
import java.util.UUID;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CompanyRepository extends CassandraRepository<Companies, UUID> {
}
