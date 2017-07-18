package demo.GORMwithoutGrails.service

import demo.GORMwithoutGrails.domain.Make
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service('makeService')
@Transactional
class MakeServiceImpl implements MakeService {

    @Override
    List<Make> list() {
        Make.list()
    }
}
