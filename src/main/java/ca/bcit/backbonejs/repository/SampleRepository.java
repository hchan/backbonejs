package ca.bcit.backbonejs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.bcit.backbonejs.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
