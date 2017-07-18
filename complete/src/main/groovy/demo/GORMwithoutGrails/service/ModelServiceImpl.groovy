package demo.GORMwithoutGrails.service

import demo.GORMwithoutGrails.domain.Model
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service('modelService')
@Transactional
class ModelServiceImpl implements ModelService {

    @Override
    List<Model> list() {
        Model.list()
    }
}
