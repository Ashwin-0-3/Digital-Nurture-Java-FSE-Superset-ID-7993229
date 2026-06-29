package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
        private BookRepository repo;
        public void setRepo(BookRepository repo)
        {
            this.repo=repo;
        }
        public void issueBook(String bk)
        {
            System.out.println("Issuing Book : "+bk);
            repo.save(bk);
        }
}
